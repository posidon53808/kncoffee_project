package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="porder")
public class porder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer A;
	private Integer B;
	private Integer C;
	private Integer D;
	private Integer E;
	private Integer F;
	private Integer Sum;
	private Integer discountPrice;
	public porder() {
		super();
	}
	public porder(Integer a, Integer b, Integer c, Integer d, Integer e, Integer f) {
		super();
		A = a;
		B = b;
		C = c;
		D = d;
		E = e;
		F = f;
		Sum = A*150+B*120+C*100+D*100+E*100+F*100;
		if(Sum>2000) {
		discountPrice = (int)(Sum*0.95);
		}else { discountPrice=Sum;}
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getA() {
		return A;
	}
	public void setA(Integer a) {
		A = a;
	}
	public Integer getB() {
		return B;
	}
	public void setB(Integer b) {
		B = b;
	}
	public Integer getC() {
		return C;
	}
	public void setC(Integer c) {
		C = c;
	}
	public Integer getD() {
		return D;
	}
	public void setD(Integer d) {
		D = d;
	}
	public Integer getE() {
		return E;
	}
	public void setE(Integer e) {
		E = e;
	}
	public Integer getF() {
		return F;
	}
	public void setF(Integer f) {
		F = f;
	}
	public Integer getSum() {
		Sum=A*150+B*120+C*100+D*100+E*100+F*100;
		return Sum;
	}
	public void setSum(Integer sum) {
		Sum = sum;
	}
	public Integer getDiscountPrice() {
		if(Sum>2000) {
			discountPrice = (int)(Sum*0.95);
			}else { discountPrice=Sum;}
		
		return discountPrice;
	}
	public void setDiscountPrice(Integer discountPrice) {
		this.discountPrice = discountPrice;
	}
	
}
