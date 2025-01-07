package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json.JsValue

@Singleton
class MichaelsController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def index(my_str: String) = Action { implicit request: Request[AnyContent] =>
    Ok(s"Index page with parameter: $my_str")
  }
}
