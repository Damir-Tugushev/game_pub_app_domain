package io.github.damir_tugushev.game_pub_app.domain.interactor

/**
 * Checks if the provided [login] meets all requirements of the module.
 *
 * Requirements are:
 * - must be from 8 to 20 characters in length
 * - must contain latin or `-`, `_`, `.` characters
 * - must not start or end with `-`, `_`, `.` characters
 * - `-`, `_`, `.` characters can't be next to each other
 * - `-`, `_`, `.` characters can't be used multiple times in a row
 */
public fun checkUsername(login: String): Boolean = usernameRegex.matches(login)

private val usernameRegex = Regex("^(?=.{8,20}\$)(?![-_.])(?!.*[-_.]{2})[a-zA-Z0-9-_.]+(?<![-_.])\$")

/**
 * Checks if the provided [password] meets all requirements of the module.
 *
 * Requirements are:
 * - must be from 8 characters in length
 * - must contain at least one upper case latin letter
 * - must contain at least one lower case latin letter
 * - must contain at least one digit
 * - must contain at least one special character: `(`, `)`, `#`, `?`, `!`, `@`, `$`, `%`, `^`, `&`, `*`, `_`, or `-`
 */
public fun checkPassword(password: String): Boolean = passwordRegex.matches(password)

private val passwordRegex = Regex("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?\\d)(?=.*?[()#?!@$%^&*_-]).{8,}\$")
