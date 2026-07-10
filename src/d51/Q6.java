package d51;

//実行用クラス
public class Q6 {
    static void main(String[] args) {
        Item[] li = {new Item("AA", "魚類"), new Item("BB", "肉類")}; // 4:大分類の記録
        Item[] si = {new Item("A1", "さば"), new Item("A2", "さんま"),
                new Item ("B1", "牛肉"), new Item ("B2", "鶏肉"),
        new Item ("B3", "豚肉")}; // 4:小分類の記録。この後のclass Itemのコードを読むと理解しやすくなる

        ItemMaster im = new ItemMaster(li, si);
        String lcode = args[0].substring(0, 2); // 大分類コードをsubstringを使いlcodeへ代入
        String scode = args[0].substring(2, 4); // 小分類コードをsubstringを使いscodeへ代入
        String details = args[0].substring(4); // 詳細コードをsubstringを使いdetailsへ代入

        String lname = im.getItemName(im.MAJOR, lcode); // 商品コードから得た大分類の名称をItemMaster(im)から取得
        String sname = im.getItemName(im.MINOR, scode); // 商品んコードから得た小分類の名称をItemMaster(im)から取得
        System.out.println("商品コード:" + args[0]); // 商品コードの出力
        System.out.println("大分類名:" + lname); // 大分類名の出力
        System.out.println("小分類名:" + sname); // 小分類名の出力
        System.out.println("詳細コード:" + details); // 詳細コードの出力
            }
    }

    // 大分類コードまたは小分類コード、それに対応する名称を記録するためのクラス
    class Item {
    private String code; // メンバ変数code(このクラスからのみアクセス可能)
    private String name; // 同様にprivateをつけることにより、nameもこのクラスからのみアクセス可能
    Item(String code, String name) { // コンストラクタ。newされたときに呼び出され、メンバ変数を初期化
        this.code = code; // 引数からの値をメンバ変数に格納する際はthisをつける
        this.name = name; // 同様、引数nameの値をthis.nameに格納
    }
    public String getCode() {return code;} // codeの値を外部から取得するためのゲッターメソッド (メンバ変数)
        public String getName() {return name;} // nameの値を外部から取得するためのゲッターメソッド
    }

    // すべての項目を管理するとともに、大分類コードまたは小分類コードに対応する名称を返す処理を行うクラス。商品マスターとして用いる
    class ItemMaster{
    public int MAJOR = 0; // items配列で大分類を指すインデックス(0)。publicをつけることで外部からアクセスできる
    public int MINOR = 1; // items配列で大分類を指すインデックス()。publicをつけることで外部からアクセスできる
    private Item[][] items; // 実行用クラス(Q6)でインスタンス化されたすべての項目を記録する配列
    ItemMaster(Item[] major, Item[] minor){ // このコンストラクタはオブジェクト引数に呼び出されている
        items = new Item[2][]; // [0][]が大分類、[1][]が小分類。2次元目は後から代入するため省略
        items[MAJOR] = major; // items[0]には大分類のデータセットを格納
        items[MINOR] = minor; // items[1]には小分類のデータセットを格納
        }

        // 大分類コードや小分類コードから名称をitemsからさがして返す (ゲッターメソッド)
        public String getItemName(int codeLevel, String code){
        for (int i = 0; i < items.length; i++){ // 指定されたcodeLevel(大分類または小分類)の要素数分を繰り返す
            if(code.equals(items[codeLevel][i].getCode())){ // 引数のcodeとitemsのcodeが同じ(equals)
                return items[codeLevel][i].getName(); // 名称を返す
            }
        }

        return "(不明)"; // 5:大分類コードや小分類コードに対応する名称がない場合は"(不明)"という文字列を返す
        }
    }

