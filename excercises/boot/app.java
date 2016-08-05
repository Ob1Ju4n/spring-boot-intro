@RestController
public class HelloWorld{

	@RequestMapping("/")
	public String name(){
		return "Hello, world!";
	}
}