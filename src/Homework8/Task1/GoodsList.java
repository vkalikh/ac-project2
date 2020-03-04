package Homework8.Task1;

public class GoodsList {

    private String goodsName;
    private float cost;
    private int count;

    public GoodsList(String goodsName, float cost, int count) {
        this.goodsName = goodsName;
        this.cost = cost;
        this.count = count;
    }

    public GoodsList() {
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
