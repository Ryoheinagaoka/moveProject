package service;

public class MathServiceImpl implements MathService {

	@Override
	public int sum(int x, int y) {
		
		int ans = 0;
		
		for(int i=x;i <= y; i++) {
			ans += i;
		}
		
		return ans;
	}

}
