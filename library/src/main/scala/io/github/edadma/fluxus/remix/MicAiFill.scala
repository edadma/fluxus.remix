/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * MicAiFill icon from the Remix Icon library, Media category.
 */
case class MicAiFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * MicAiFill icon component.
 *
 * @example MicAiFill <> MicAiFillProps(size = 24, color = "blue")
 */
def MicAiFill = (props: MicAiFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.4668 7.69379L20.7134 7.12811C21.1529 6.11947 21.9445 5.31641 22.9323 4.87708L23.6919 4.53922C24.1027 4.35653 24.1027 3.75881 23.6919 3.57612L22.9748 3.25714C21.9616 2.80651 21.1558 1.97373 20.7238 0.930828L20.4706 0.319534C20.2942 -0.106511 19.7058 -0.106511 19.5293 0.319534L19.2761 0.930828C18.8442 1.97373 18.0384 2.80651 17.0252 3.25714L16.308 3.57612C15.8973 3.75881 15.8973 4.35653 16.308 4.53922L17.0677 4.87708C18.0555 5.31641 18.8471 6.11947 19.2866 7.12811L19.5331 7.69379C19.7136 8.10792 20.2864 8.10792 20.4668 7.69379ZM14.3869 5.33879C14.661 5.77254 15.0357 6.09305 15.5111 6.30032L16.0764 6.54679C16.4565 6.71249 16.7643 6.94524 16.9998 7.24503V10C16.9998 12.7614 14.7612 15 11.9998 15C9.23833 15 6.99976 12.7614 6.99976 10V6C6.99976 3.23858 9.23833 1 11.9998 1C13.1238 1 14.1613 1.37094 14.9964 1.99709C14.7563 2.17678 14.5531 2.39813 14.3869 2.66114C14.129 3.06938 14 3.51566 14 3.99997C14 4.48428 14.129 4.93056 14.3869 5.33879ZM3.05469 11H5.07065C5.55588 14.3923 8.47329 17 11.9998 17C15.5262 17 18.4436 14.3923 18.9289 11H20.9448C20.4837 15.1716 17.1714 18.4839 12.9998 18.9451V23H10.9998V18.9451C6.82814 18.4839 3.51584 15.1716 3.05469 11Z")
  )
}
