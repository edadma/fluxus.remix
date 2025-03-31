/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * Compasses2Line icon from the Remix Icon library, Design category.
 */
case class Compasses2LineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * Compasses2Line icon component.
 *
 * @example Compasses2Line <> Compasses2LineProps(size = 24, color = "blue")
 */
def Compasses2Line = (props: Compasses2LineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M16.3303 13.497C17.9562 12.2151 19 10.2278 19 7.9967H21C21 10.9687 19.5595 13.6043 17.3385 15.2432L19.8661 19.6211C20.4183 20.5776 20.0906 21.8008 19.134 22.3531L15.6073 16.2447C14.5029 16.7283 13.2828 16.9967 12 16.9967C10.7172 16.9967 9.49712 16.7283 8.39278 16.2447L4.86606 22.3531C3.90947 21.8008 3.58172 20.5776 4.13401 19.6211L9.19751 10.8508C8.45844 10.125 8.00003 9.11439 8.00003 7.9967C8.00003 6.13286 9.2748 4.56676 11 4.12272V1.9967H13V4.12272C14.7253 4.56676 16 6.13286 16 7.9967C16 9.11439 15.5416 10.125 14.8025 10.8508L16.3303 13.497ZM14.599 14.4983L13.071 11.8517C12.7302 11.9462 12.371 11.9967 12 11.9967C11.6291 11.9967 11.2699 11.9462 10.929 11.8517L9.40101 14.4983C10.2046 14.8198 11.0817 14.9967 12 14.9967C12.9184 14.9967 13.7955 14.8198 14.599 14.4983ZM12 9.9967C13.1046 9.9967 14 9.10127 14 7.9967C14 6.89213 13.1046 5.9967 12 5.9967C10.8955 5.9967 10 6.89213 10 7.9967C10 9.10127 10.8955 9.9967 12 9.9967Z")
  )
}
