/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * BaseStationLine icon from the Remix Icon library, Device category.
 */
case class BaseStationLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * BaseStationLine icon component.
 *
 * @example BaseStationLine <> BaseStationLineProps(size = 24, color = "blue")
 */
def BaseStationLine = (props: BaseStationLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M12 13L18 22H6L12 13ZM12 16.6L9.74 20H14.26L12 16.6ZM10.9393 10.5606C10.3536 9.97486 10.3536 9.02511 10.9393 8.43933C11.5251 7.85354 12.4749 7.85354 13.0607 8.43933C13.6464 9.02511 13.6464 9.97486 13.0607 10.5606C12.4749 11.1464 11.5251 11.1464 10.9393 10.5606ZM5.28249 2.78247L6.6967 4.19668C3.76777 7.12562 3.76777 11.8744 6.6967 14.8033L5.28249 16.2175C1.5725 12.5075 1.5725 6.49245 5.28249 2.78247ZM18.7175 2.78247C22.4275 6.49245 22.4275 12.5075 18.7175 16.2175L17.3033 14.8033C20.2322 11.8744 20.2322 7.12562 17.3033 4.19668L18.7175 2.78247ZM8.11091 5.6109L9.52513 7.02511C8.15829 8.39195 8.15829 10.608 9.52513 11.9749L8.11091 13.3891C5.96303 11.2412 5.96303 7.75878 8.11091 5.6109H8.11091ZM15.8891 5.6109C18.037 7.75878 18.037 11.2412 15.8891 13.3891L14.4749 11.9749C15.8417 10.608 15.8417 8.39195 14.4749 7.02511L15.8891 5.6109Z")
  )
}
