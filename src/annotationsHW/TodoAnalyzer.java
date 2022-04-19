package annotationsHW;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TodoAnalyzer {

	public String getTodoReport(Class<? extends Object> class2) {
		return Arrays.stream(class2.getDeclaredMethods())
				.filter(method -> method.getAnnotation(Todo.class) != null)
				.map(method -> {
					var todoAnnotation = method.getAnnotation(Todo.class);
					return "method name: " + method.getName() 
						+ ", author: " + todoAnnotation.author()
						+ ", priority: " + todoAnnotation.priority()
						+ ", status: " + todoAnnotation.status();
				})
				.collect(Collectors.joining(System.lineSeparator()));
	}
}
