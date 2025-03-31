/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SpaceShipLine icon from the Remix Icon library, Map category.
 */
case class SpaceShipLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SpaceShipLine icon component.
 *
 * @example SpaceShipLine <> SpaceShipLineProps(size = 24, color = "blue")
 */
def SpaceShipLine = (props: SpaceShipLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M2.87988 18.0491C4.23015 12.0558 7.07526 6.62853 11.003 2.17961C11.1105 2.05781 11.2465 1.90745 11.411 1.72854C11.7101 1.40328 12.2162 1.38206 12.5414 1.68112C12.5579 1.69626 12.5737 1.71207 12.5888 1.72854C12.7553 1.9096 12.8929 2.06167 13.0015 2.18473C16.9268 6.6327 19.7703 12.0581 21.12 18.0491C18.9786 18.5004 16.7797 18.7961 14.5359 18.9236L12.4472 23.101C12.3237 23.348 12.0233 23.4481 11.7763 23.3246C11.6796 23.2762 11.6011 23.1978 11.5527 23.101L9.46401 18.9236C7.22018 18.7961 5.02133 18.5004 2.87988 18.0491ZM9.57748 16.9268L10.7346 16.9925L11.9999 19.5233L13.2653 16.9925L14.4224 16.9268C15.8443 16.846 17.2543 16.6941 18.6488 16.4724C17.3229 11.9192 15.0539 7.70522 11.9999 4.08528C8.94595 7.7052 6.67696 11.9192 5.35112 16.4724C6.74562 16.6941 8.15563 16.846 9.57748 16.9268ZM11.9999 14.9954C10.3431 14.9954 8.99994 13.6523 8.99994 11.9954C8.99994 10.3386 10.3431 8.99544 11.9999 8.99544C13.6568 8.99544 14.9999 10.3386 14.9999 11.9954C14.9999 13.6523 13.6568 14.9954 11.9999 14.9954ZM11.9999 12.9954C12.5522 12.9954 12.9999 12.5477 12.9999 11.9954C12.9999 11.4432 12.5522 10.9954 11.9999 10.9954C11.4477 10.9954 10.9999 11.4432 10.9999 11.9954C10.9999 12.5477 11.4477 12.9954 11.9999 12.9954Z")
  )
}
