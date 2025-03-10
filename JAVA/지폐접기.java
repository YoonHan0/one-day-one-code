package JAVA;

public class Solution0310_001 {
    
    // 개선전 코드
    public static void main(String[] args) {
		
        // 테스트 케이스 만들기
		int[] wallet = new int[]{50, 50};
		int[] bill = new int[]{100, 241};
		int result = soluation(wallet, bill);

        // 결과 확인
		System.out.println(result);
	}

	public static int soluation(int[] wallet, int[] bill) {
		// 15:25 문제 풀이 시작
		// 15:47 문제 해결
		int result = 0;
		int maxWalletValue = returnMax(wallet)[1];
		int minWalletValue = returnMin(wallet)[1];

		while(true) {
			int[] billMax = returnMax(bill);
			int[] billMin = returnMin(bill);
			int maxBillIndex = billMax[0];
			int maxBillValue = billMax[1];
			int minBillIndex = billMin[0];
			int minBillValue = billMin[1];

			if(maxWalletValue >= maxBillValue && minWalletValue >= minBillValue) {
				break;
			}

			bill[maxBillIndex] = maxBillValue / 2;
			result++;
		}

		return result;
	}

	public static int[] returnMax(int[] arr) {		// [index, maxValue] 리턴
		int[] result = new int[]{0, 0};

		if(arr[0] > arr[1]) {
			result[0] = 0;
			result[1] = arr[0];
		}
		else {
			result[0] = 1;
			result[1] = arr[1];
		}
		return result;
	}

	public static int[] returnMin(int[] arr) {		// [index, minValue] 리턴
		int[] result = new int[]{0, 0};

		if(arr[0] < arr[1]) {
			result[0] = 0;
			result[1] = arr[0];
		}
		else {
			result[0] = 1;
			result[1] = arr[1];
		}
		return result;
	}

    /* ---------------------- 개선 후 ---------------------- */
    public static int solution(int[] wallet, int[] bill) {
        int result = 0;

        int walletMax = Math.max(wallet[0], wallet[1]);
        int walletMin = Math.min(wallet[0], wallet[1]);

        while(true) {
            int billMax = Math.max(bill[0], bill[1]);
            int billMin = Math.min(bill[0], bill[1]);

            if(walletMax >= billMax && walletMin >= billMin) {
                break;
            }
            if(billMax == bill[0]) {
                bill[0] = billMax / 2;
            }
            else {
                bill[1] = billMax / 2;
            }
            result++;
        }
        return result;
    }

    /* ---------------------- 개선 후(2) ---------------------- */
    public static int sol(int[] wallet, int[] bill) {
		int result = 0;

		while(Math.max(wallet[0], wallet[1]) < Math.max(bill[0], bill[1]) || Math.min(wallet[0], wallet[1]) < Math.min(bill[0],  bill[1])) {
			bill[bill[0] > bill[1] ? 0 : 1] /= 2;
			result++;
		}
		return result;
	}

}
