
package com.dmm.task.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// すべてのリクエストを認証なしで通過させる
		http.authorizeRequests().anyRequest().permitAll();

		// ログイン設定
		http.formLogin() // フォーム認証の有効化
				.loginPage("/loginForm") // ログインフォームを表示するパス
				.loginProcessingUrl("/authenticate") // フォーム認証処理のパス
				.usernameParameter("userName") // ユーザ名のリクエストパラメータ名
				.passwordParameter("password") // パスワードのリクエストパラメータ名
				.defaultSuccessUrl("/posts") // ※ ここを変更
				.failureUrl("/loginForm?error=true"); // 認証失敗時に遷移するパス

		// ログアウト設定
		http.logout().logoutSuccessUrl("/loginForm") // ログアウト成功時に遷移するパス
				.permitAll(); // 全ユーザに対して許可
	}


}