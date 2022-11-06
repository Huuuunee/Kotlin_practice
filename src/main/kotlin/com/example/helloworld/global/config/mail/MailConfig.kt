package com.example.helloworld.global.config.mail

import com.example.helloworld.global.config.mail.properties.MailProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl

@Configuration
class MailConfig(
    private val mailProperties: MailProperties
) {
    @Bean
    fun getJavaMailSender(): JavaMailSender =
        JavaMailSenderImpl().apply {
            this.host = mailProperties.host
            this.port = mailProperties.port
            this.username = mailProperties.username
            this.password = mailProperties.password

            this.javaMailProperties["mail.smtp.auth"] = true
            this.javaMailProperties["mail.smtp.connectiontimeout"] = 5000
            this.javaMailProperties["mail.smtp.timeout"] = 5000
            this.javaMailProperties["mail.smtp.writetimeout"] = 5000
            this.javaMailProperties["mail.transport.protocol"] = "smtp"
            this.javaMailProperties["mail.smtp.starttls.enable"] = true
            this.javaMailProperties["mail.smtp.starttls.required"] = true
        }
}