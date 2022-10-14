# 221013-gradle-hospital

# 2. Gradle 사용해서 parsing 하기
## 1. Gradle
### 1) Gradle(maven)빌드를 사용한 이유
![](https://velog.velcdn.com/images/lyj1023/post/462dbe42-f6a7-44e4-b549-2d3819336c1c/image.png)
- 다음과 같이 Gradle 빌드를 사용하면 test case를 작성하고 실행하기 좋다.
- TDD를 하기 위해서 사용한다.

### 2) TDD란?
- Test Driven Development의 약자로 테스트 주도 개발이라고 한다.
- 기존 방식: 요구사항 분석 -> 설계 -> 코드 개발 -> 테스트 케이스 작성
- TDD: 요구사항 분석 -> 테스트 케이스 작성 -> 코드 개발 -> 리펙토링
	- 단점: 테스트 코드 개발 + 실제 개발을 같이하기 때문에 오래 걸린다.

### 3) 테스트의 종류
- Unit Test(유닛 테스트), Integration Test(통합 테스트), Functional Test(기능 테스트)가 있다.
	- Unit Test: 함수 하나하나와 같이 코드의 작은 부분을 테스트
    - Integration Test: 서로 다른 시스템들의 상호작용이 잘 이루어지는지 테스트, 배포하기 전에 한다.
    - Functional Test: 사용자와 어플리케이션의 상호작용이 원활하게 이루어지는지 테스트
- Unit Test < Integration Test < Functional Test 순으로 테스트 케이스의 개수가 많다.

### 4) Test Class 만들기
![](https://velog.velcdn.com/images/lyj1023/post/9a4665b0-74b3-4633-9a5f-5b32d03f0fb7/image.png)
- test case를 만들고 싶은 class에 alt+enter > Create Test

![](https://velog.velcdn.com/images/lyj1023/post/6be49082-3f06-42e0-b80a-a07ec474fd3d/image.png)
- 원하는 이름을 설정한 후 OK

![](https://velog.velcdn.com/images/lyj1023/post/f708edee-ba09-4fce-9393-00f61d446b9b/image.png)
- 다음과 같이 test폴더에 test class가 생성된다.

### 5) 코드 작성
 1) Gradble 빌드로 병원 정보 parser 만들기

- (Hospital.java)
- (HospitalParser.java)
- (LineReader.java)
- (Main.java)
- (Parser.java)
- (HospitalParserTest.java)

>Annotation
> - JDK 1.5버전 이상에서 자바 소스 코드에 추가하여 사용할 수 있는 메타데이터의 일종이다. 보통 @기호를 앞에 붙여서 사용한다.
> - 용도
>	  - 컴파일러에게 코드 작성 문법 에러를 체크하도록 정보를 제공한다.
>   - 소프트웨어 개발툴이 빌드나 배치시 코드를 자동으로 생성할 수 있도록 정보를 제공한다.
>   - 실행시(런타임시)특정 기능을 실행하도록 정보를 제공한다.


 2) test class에 address 추가

- (Hospital.java)
- (HospitalParser.java)
- (HospitalParserTest.java)

3) test class에 district 추가

- (Hospital.java)
- (HospitalParser.java)
- (HospitalParserTest.java)

4) test class에 category,emergencyRoom,name 추가

- (Hospital.java)
- (HospitalParser.java)
- (HospitalParserTest.java)

5) test class에 subdivision 추가

- (Hospital.java)
- (HospitalParser.java)
- (HospitalParserTest.java)

6) SqlInsertQuery 메소드 추가 후 테스트

- (Hospital.java)
- (Main.java)
- (HospitalParserTest.java)

# 3. Reference
- 테스트 케이스 참고: https://cjwoov.tistory.com/9
- TDD 참고: http://clipsoft.co.kr/wp/blog/tddtest-driven-development-%EB%B0%A9%EB%B2%95%EB%A1%A0/
- 어노테이션 참고: https://bangu4.tistory.com/199
