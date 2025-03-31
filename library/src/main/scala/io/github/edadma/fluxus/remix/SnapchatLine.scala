/**
 * This icon is part of Remix Icon library (https://remixicon.com/)
 * Licensed under the Apache License 2.0
 * https://github.com/Remix-Design/RemixIcon/blob/master/License
 */

package io.github.edadma.fluxus.remix

import io.github.edadma.fluxus._

/**
 * SnapchatLine icon from the Remix Icon library, Logos category.
 */
case class SnapchatLineProps(
  size: Int = 24,
  color: String = "currentColor",
  className: String = ""
)

/**
 * SnapchatLine icon component.
 *
 * @example SnapchatLine <> SnapchatLineProps(size = 24, color = "blue")
 */
def SnapchatLine = (props: SnapchatLineProps) => {
  svg(
    viewBox := "0 0 24 24",
    xmlns := "http://www.w3.org/2000/svg",
    width := props.size.toString,
    height := props.size.toString,
    fill := props.color,
    cls := props.className,
    path(d := "M15.3826 10.5792C15.3904 10.4826 15.3969 10.4035 15.4025 10.3311C15.4137 10.1844 15.4243 10.0268 15.4344 9.85059C15.4662 9.29326 15.4853 8.67669 15.4853 8.00554C15.4853 7.1344 15.191 6.51928 14.571 5.94177C13.9117 5.3277 13.1124 5 11.9819 5C10.8441 5 10.0229 5.33486 9.4705 5.88766C8.77543 6.58319 8.51358 7.10616 8.51358 7.98803C8.51358 8.50939 8.57456 9.98166 8.60927 10.6065C8.63818 11.1269 8.46325 11.6252 8.14058 12.0076C8.19484 12.1062 8.24561 12.2117 8.29289 12.3251C8.59378 13.0961 8.4912 13.8677 8.1413 14.5963C7.74878 15.4136 7.41022 15.9889 6.7313 16.7497C6.52804 16.9775 6.31412 17.1923 6.08941 17.3927C6.25199 17.5489 6.38901 17.7334 6.49251 17.9404C6.49542 17.9462 6.49827 17.9519 6.50106 17.9575C7.01006 17.9137 7.52238 17.93 8.08587 18.032C8.89536 18.1784 9.41032 18.4661 10.2803 19.0933L10.2958 19.1042C10.4079 19.184 10.4079 19.184 10.5093 19.2562C11.1281 19.6957 11.3863 19.802 11.9819 19.802C12.5908 19.802 12.892 19.6808 13.5054 19.2501C13.554 19.2159 13.6109 19.1756 13.7125 19.1036C14.5885 18.4722 15.1194 18.1765 15.9433 18.0281C16.4093 17.9491 16.9362 17.9154 17.5022 17.9538C17.517 17.9255 17.5331 17.8957 17.551 17.8635C17.6502 17.685 17.7747 17.525 17.9192 17.3873C17.7052 17.1946 17.4999 16.9885 17.3032 16.7705C16.8745 16.2954 16.5148 15.7932 16.2164 15.2892C16.0348 14.9826 15.9084 14.7317 15.8559 14.611C15.4931 13.8621 15.3867 13.0718 15.7191 12.29C15.7598 12.1923 15.8038 12.1005 15.8509 12.0139C15.5196 11.6223 15.3447 11.1099 15.3826 10.5792ZM5.06689 10.4776C5.48626 10.4776 5.66798 10.7826 6.28626 10.7826C6.44278 10.7826 6.54713 10.7478 6.61235 10.7174C6.60365 10.5609 6.51358 8.73083 6.51358 7.98803C6.51358 6.29966 7.23253 5.29775 8.05583 4.47391C8.87912 3.65008 10.1616 3 11.9819 3C13.8022 3 15.0481 3.65305 15.9341 4.47826C16.8201 5.30347 17.4853 6.4089 17.4853 8.00554C17.4853 9.56082 17.3863 10.6 17.3776 10.7217C17.4341 10.7522 17.5294 10.787 17.6558 10.787C18.2866 10.787 18.2866 10.4776 18.9863 10.4776C19.6715 10.4776 19.9689 11.0468 19.9689 11.3C19.9689 11.9213 19.1368 12.2675 18.6384 12.4261C18.2703 12.5433 17.708 12.7174 17.5645 13.0609C17.4906 13.2348 17.521 13.4609 17.6558 13.7391C17.6597 13.747 18.9167 16.6217 21.5863 17.0652C21.821 17.1 21.9776 17.3065 21.9776 17.5478C21.9776 17.8805 21.608 18.1652 21.2515 18.3304C20.808 18.5304 20.1602 18.7 19.2993 18.8348C19.2558 18.913 19.1648 19.3201 19.0645 19.7217C18.9292 20.2636 18.2633 20.0881 18.0732 20.0478C17.2413 19.8716 16.5341 19.9565 16.2776 20C15.795 20.087 15.3645 20.3783 14.8819 20.7261C14.1689 21.2304 13.4172 21.802 11.9819 21.802C10.5466 21.802 9.83843 21.2304 9.12539 20.7261C8.64278 20.3783 8.22066 20.0888 7.72974 20C6.83117 19.8374 6.15981 20.0357 5.93409 20.0565C5.70837 20.0773 5.09257 20.3009 4.93843 19.7304C4.89359 19.5645 4.74713 18.9217 4.70365 18.8348C3.84713 18.7 3.19496 18.5217 2.75148 18.3217C2.38626 18.1565 2.02539 17.8787 2.02539 17.5435C2.02539 17.3078 2.18336 17.1034 2.41669 17.0609C5.06017 16.5785 6.18185 14.0565 6.33843 13.7304C6.47054 13.4554 6.4993 13.2304 6.42974 13.0522C6.28626 12.7087 5.72539 12.5391 5.35583 12.4174C5.25148 12.3826 4.02067 12.0445 4.02067 11.3C4.02067 11.06 4.22508 10.7269 4.60241 10.5704C4.76382 10.5035 4.9609 10.4776 5.06689 10.4776Z")
  )
}
