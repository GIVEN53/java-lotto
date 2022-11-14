package lotto;

import camp.nextstep.edu.missionutils.Console;
import lotto.entity.Lotto;
import lotto.exception.Bonus;
import lotto.exception.InputNumbers;
import lotto.exception.PurchaseAmount;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    }

    public static int askPurchaseAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        String purchaseAmount = Console.readLine();
        PurchaseAmount.checkException(purchaseAmount);
        System.out.println();
        return Integer.parseInt(purchaseAmount);
    }

    public static void showMyLottoNumbers(int purchaseCount, List<Lotto> myLotto) {
        System.out.println(purchaseCount + "개를 구매했습니다.");
        for (int i = 0; i < purchaseCount; i++) {
            System.out.println(myLotto.get(i).getNumbers());
        }
        System.out.println();
    }

    public static String askNumbers() {
        System.out.println("당첨 번호를 입력해 주세요.");
        String stringNumbers = Console.readLine();
        InputNumbers.checkException(stringNumbers);
        System.out.println();
        return stringNumbers;
    }

    public static int askBonus() {
        System.out.println("보너스 번호를 입력해 주세요.");
        String bonus = Console.readLine();
        Bonus.checkException(bonus);
        System.out.println();
        return Integer.parseInt(bonus);
    }
}
