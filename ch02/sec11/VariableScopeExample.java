package ch02.sec11;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;		
		if(v1>10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		
		//v2 변수가 if안에서 선언 하였으므로 컴파일 오류가 생긴다. v2를 if문 밖에서 선언하면 컴파일 오류를 해결 할 수 있다
	}

}
