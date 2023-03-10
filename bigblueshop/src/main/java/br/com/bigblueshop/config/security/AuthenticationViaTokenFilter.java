package br.com.bigblueshop.config.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import br.com.bigblueshop.model.User;
import br.com.bigblueshop.repository.UserRepository;

public class AuthenticationViaTokenFilter extends OncePerRequestFilter {

	private TokenService tokenService;
	private UserRepository userRepository;

	public AuthenticationViaTokenFilter(TokenService tokenService, UserRepository userRepository) {
		this.tokenService = tokenService;
		this.userRepository = userRepository;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		String token = tokenRetrive(request);

		boolean valid = tokenService.isAValidToken(token);

		if (valid) {
			authenticateClient(token);
		}

		filterChain.doFilter(request, response);

	}

	private void authenticateClient(String token) {
		Long userId = tokenService.getIdUser(token);
		User user = userRepository.findById(userId).get();
		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(authentication);
	}

	private String tokenRetrive(HttpServletRequest request) {
		String token = request.getHeader("Authorization");
		if (token == null || token.isEmpty() || !token.startsWith("Bearer ")) {
			return null;
		}

		return token.substring(7, token.length());
	}

}
