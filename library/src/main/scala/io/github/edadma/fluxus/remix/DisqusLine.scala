/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * DisqusLine icon from the Remix Icon library, Logos category.
 */
case class DisqusLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * DisqusLine icon component.
 *
 * @example DisqusLine <> DisqusLineProps(size = 24, color = "blue")
 */
def DisqusLine = (props: DisqusLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M11.9971 2C17.52 2 21.9971 6.47715 21.9971 12C21.9971 17.5228 17.52 22 11.9971 22C9.69135 22 7.50495 21.2156 5.74846 19.8078L1.03027 20.3973L2.74948 15.8116C2.2553 14.614 1.99712 13.3245 1.99712 12C1.99712 6.47715 6.47427 2 11.9971 2ZM11.9971 4C7.57884 4 3.99712 7.58172 3.99712 12C3.99712 13.178 4.25126 14.3181 4.73544 15.3619L4.91161 15.7418L4.06396 18.0027L6.37947 17.7134L6.71733 18.0105C8.16756 19.2855 10.0256 20 11.9971 20C16.4154 20 19.9971 16.4183 19.9971 12C19.9971 7.58172 16.4154 4 11.9971 4ZM8.04712 7.0003H11.8367C15.2578 7.0003 17.2778 8.95633 17.3766 11.7287L17.3805 11.9436V11.9714C17.3805 14.7848 15.4185 16.8928 12.043 16.9963L11.7806 17.0003H8.04712V7.0003H11.8367H8.04712ZM11.8785 9.45793H10.7701V14.5434H11.8785C13.4439 14.5434 14.5032 13.6979 14.5824 12.1978L14.5871 12.0147V11.9868C14.5871 10.3861 13.5065 9.45793 11.8785 9.45793Z")
  )
}
