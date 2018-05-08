package C3;

//摩卡咖啡（英语：Café Mocha，意大利语：Mocaccino，又名莫加或者摩卡）是意式拿铁咖啡的变种。
//和经典的意式拿铁咖啡一样，它通常是由三分之一的意式浓缩咖啡和三分之二的奶沫配成，不过它还会加
//入少量巧克力。巧克力通常会以巧克力糖浆的形式添加，但某些咖啡售卖系统便会以速溶巧克力粉取代。
//有时，打起了的奶油、可可粉，和棉花糖都会加在上面用来加重咖啡的香味和作为装饰之用。
//ref:zh.wikipedia.org/wiki/摩卡咖啡

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	public double cost() {
		return 0.20 + beverage.cost();
	}
}
