# Spring-mvc
### 요청 파라미터
https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-methods/arguments.html<br>
### 응답값
https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-methods/return-types.html<br>
<br>

lombok의 @Data 는<br>
@Getter , @Setter , @ToString , @EqualsAndHashCode , @RequiredArgsConstructor 를 자동으로 적용해준다.<br><br>

@ModelAttribute 는 생략할 수 있다.<br>
그런데 @RequestParam 도 생략할 수 있으니 혼란이 발생할 수 있다.<br>
스프링은 해당 생략시 다음과 같은 규칙을 적용한다.<br>
String , int , Integer 같은 단순 타입 = @RequestParam<br>
나머지 = @ModelAttribute (argument resolver 로 지정해둔 타입 외)<br>

