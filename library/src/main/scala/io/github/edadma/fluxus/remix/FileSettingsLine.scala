/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * FileSettingsLine icon from the Remix Icon library, Document category.
 */
case class FileSettingsLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * FileSettingsLine icon component.
 *
 * @example FileSettingsLine <> FileSettingsLineProps(size = 24, color = "blue")
 */
def FileSettingsLine = (props: FileSettingsLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M8.59456 12.8115C8.53273 12.5511 8.5 12.2794 8.5 12C8.5 11.7207 8.53272 11.449 8.59454 11.1886L7.60291 10.6161L8.60291 8.88402L9.59523 9.45694C9.98834 9.08508 10.4676 8.80338 11 8.64494V7.5H13V8.64494C13.5324 8.80337 14.0116 9.08506 14.4047 9.4569L15.3971 8.88393L16.3972 10.616L15.4054 11.1885C15.4673 11.449 15.5 11.7207 15.5 12C15.5 12.2793 15.4673 12.551 15.4055 12.8114L16.3972 13.3839L15.3972 15.116L14.4048 14.543C14.0117 14.9149 13.5325 15.1966 13.0001 15.355V16.5H11.0001V15.3551C10.4677 15.1967 9.98844 14.915 9.59532 14.5431L8.60297 15.1161L7.60291 13.384L8.59456 12.8115ZM12 13.5C12.8284 13.5 13.5 12.8284 13.5 12C13.5 11.1716 12.8284 10.5 12 10.5C11.1716 10.5 10.5 11.1716 10.5 12C10.5 12.8284 11.1716 13.5 12 13.5ZM15 4H5V20H19V8H15V4ZM3 2.9918C3 2.44405 3.44749 2 3.9985 2H16L20.9997 7L21 20.9925C21 21.5489 20.5551 22 20.0066 22H3.9934C3.44476 22 3 21.5447 3 21.0082V2.9918Z")
  )
}
