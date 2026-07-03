package d51;

public class Q21 {
    static void main(String[] args) {
        int a = 021, b = 0x21;
        System.out.print(a + b);
    }
}
/*
[メモ]8進数、16進数
数値リテラル021は「8進数の21(に、いち)」という意味
数値リテラル0x21は「16進数の21(に、いち)」という意味
それぞれ計算すると(10進数)
a = 8*2 + 1 = 17
b = 16*2 + 1 = 33
となり、
17 + 33 = 50
となる(ウ)
 */
