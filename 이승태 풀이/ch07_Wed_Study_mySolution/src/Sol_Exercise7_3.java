/* [7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오. */

/*<내 답안>
 * 메서드 오버라이딩은 부모 클래스로부터 메서드를 상속받은 자식 클래스가 해당 메서드를 재정의 하는 것을 말합니다.
 * 이를 재정의하는 자식클래스에서는 부모 메서드와 동일한 선언부(리턴타입, 메서드이름, 매개변수)를 구현해야 합니다. 
 * 구현부에서는 자식 클래스의 요구사항에 부합하게 적절한 코드를 작성하면 됩니다.
 * 
 * 오버라이딩의 필요성은 다음과 같습니다. 
 * 첫째, 비슷한 기능이지만 불필요하게 이름만 다른 메서드를 작성하지 않게 해줍니다.
 * 비슷한 기능임에도 불구하고 매번 다른 이름의 메서드를 지어야한다면 이는 작업의 비효율을 초래합니다.
 * 둘째, 프로그래머나 사용자가 비슷한 기능의 메서드임을 짐작하게 해줍니다. 
 * 이 경우 프로그래머나 사용자는 일일이 메서드의 이름을 외우지 않아도 되므로 편의성을 증대시킵니다.
 * 
 * 
 * <모범 답안>
 * [정답] 오버라이딩(overriding)이란, ‘조상 클래스로부터 상속받은 메서드를 자손 클래 스에 맞게 재정의 하는 것’을 말한다.
	조상 클래스로부터 상속받은 메서드를 자손 클래스에서 그대로 사용할 수 없는 경우가 많기 때문에 오버라이딩이 필요하다.

 */