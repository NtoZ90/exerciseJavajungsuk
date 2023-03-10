/* [7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인 가? */

/*
 * <내 생각>
 * 생성자 체인 때문에 조상 멤버에 대한 초기화 작업이 필요할 수 있어서.
 * 
 * <모범답안>
 * [정답] 조상에 정의된 인스턴스 변수들이 초기화되도록 하기 위해서.
[해설] 자손클래스의 인스턴스를 생성하면 조상으로부터 상속받은 인스턴스변수들도 생성 되는데, 
이 상속받은 인스턴스변수들 역시 적절히 초기되어야 한다. 
상속받은 조상의 인스턴스변수들을 자손의 생성자에서 직접 초기화하기보다는 조상의 생성자를 호출함으로써 초기화되도록 하는 것이 바람직하다.
각 클래스의 생성자는 해당 클래스에 선언된 인스턴스변수의 초기화만을 담당하고, 
조상 클래스로부터 상속받은 인스턴스변수의 초기화는 조상클래스의 생성자가 처리하도록 해야 하는 것이다.

 * <모범답안을 듣고 난 후 보충된 내 생각>
 * 자손 클래스는 조상클래스의 멤버변수와 메서드를 모두 상속받는다.
 * 특히 인스턴스 멤버인 경우 조상 클래스의 멤버변수는 메서드와 깊은 연관이 있기 때문에 
 * 멤버의 값이 유효할 때만 메서드가 동작하는 경우가 있을 수 있다. 
 * (예를들어 조상 멤버가 Time이라면 int hour는 0부터 23까지만 가능하다. 메서드도 이를 바탕으로 짜여질 수 있다.)
 * 
 * 
 */