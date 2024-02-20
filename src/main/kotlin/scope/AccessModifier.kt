package org.example.scope

/* 접근제한자
*   접근 제한자에는 public, internal, private, protected 가 있다.
*   접근제한자는 변수, 함수, 클래스 선언 시 앞에 붙인다.
*
*   패키지 스코프에서는
*   public (default) - 어떤 패키지에서도 접근 가능
*   internal - 같은 모듈 내에서만 접근 가능
*   private - 같은 파일 내에서만 접근가능
*   이렇게 쓰이며 패키지스코프에서는 protected는 사용하지 않는다
*
*   클래스 스코프에서는
*   pubic (default) - 클래스 외부에서 늘 접근 가능
*   private - 클래스 내부에서만 접근가능
*   protected - 클래스 자신과 상속받은 클래스에서 접근가능
*   마찬가지로 internal은 쓰이지 않는다
*
*   개발자의 의도에 따라 외부와 내부의 용도를 분리하여 안전하게 제어하도록 제한한다.
*/


