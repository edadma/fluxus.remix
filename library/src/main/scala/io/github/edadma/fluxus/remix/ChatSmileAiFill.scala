/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * ChatSmileAiFill icon from the Remix Icon library, Communication category.
 */
case class ChatSmileAiFillProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * ChatSmileAiFill icon component.
 *
 * @example ChatSmileAiFill <> ChatSmileAiFillProps(size = 24, color = "blue")
 */
def ChatSmileAiFill = (props: ChatSmileAiFillProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M20.7134 8.12811L20.4668 8.69379C20.2864 9.10792 19.7136 9.10792 19.5331 8.69379L19.2866 8.12811C18.8471 7.11947 18.0555 6.31641 17.0677 5.87708L16.308 5.53922C15.8973 5.35653 15.8973 4.75881 16.308 4.57612L17.0252 4.25714C18.0384 3.80651 18.8442 2.97373 19.2761 1.93083L19.5293 1.31953C19.7058 0.893489 20.2942 0.893489 20.4706 1.31953L20.7238 1.93083C21.1558 2.97373 21.9616 3.80651 22.9748 4.25714L23.6919 4.57612C24.1027 4.75881 24.1027 5.35653 23.6919 5.53922L22.9323 5.87708C21.9445 6.31641 21.1529 7.11947 20.7134 8.12811ZM20 11C20.6695 11 21.3134 10.8903 21.9147 10.688C21.971 11.1174 22 11.5553 22 12C22 17.5228 17.5228 22 12 22C10.2975 22 8.6944 21.5746 7.29117 20.8242L2 22L3.17581 16.7088C2.42544 15.3056 2 13.7025 2 12C2 6.47715 6.47715 2 12 2C12.9056 2 13.7831 2.12039 14.6174 2.34603C14.2221 3.14617 14 4.04715 14 5C14 8.31371 16.6863 11 20 11ZM7 12C7 14.7614 9.23858 17 12 17C14.7614 17 17 14.7614 17 12H15C15 13.6569 13.6569 15 12 15C10.3431 15 9 13.6569 9 12H7Z")
  )
}
