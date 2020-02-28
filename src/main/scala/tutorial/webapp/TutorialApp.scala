package tutorial.webapp

import org.scalajs.dom
import dom.html
import scalajs.js.annotation.JSExport
import scalatags.JsDom.all._

@JSExport
object TutorialApp0 extends{
  @JSExport
  def main(target: html.Div) ={
    val (f, d) = ("fox", "dog")
    target.innerHTML = s"""
    <div>
      <h1>Hello World!</h1>
      <h3>This is made without the Scalatags library.</h3>
      <p>
        The quick brown <b>$f</b>
        jumps over the lazy <i>$d</b>
      </p>
    </div>
    """
  }
}

@JSExport
object TutorialApp extends{
  @JSExport
  def main(target: html.Div) = {
    val (animalA, animalB) = ("fox", "dog")


    val btn = button(
      "Click me",
      onclick := { () =>
        target.appendChild(
          p("This is how you control the dom with scalajs").render
        )
      })


    target.appendChild(
      div(
        h1("Hello World!"),
        h3("This is ", i("with"), " the Scalatags library"),
        p(
          "The quick brown ", b(animalA),
          " jumps over the lazy ",
          i(animalB), "."
        ),
        btn
      ).render
    )
  }

}