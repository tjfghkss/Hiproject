package order.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myOrderDetailDao")
public class OrderDetailDao {
	private String namespace= "order.model.OrderDetail";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	

	public int insertOrderDetails(int a1, int a2, int o_num) {
		// TODO Auto-generated method stub
		OrderDetail od = new OrderDetail();
		od.setR_num(a1);
		od.setO_count(a2);
		od.setO_num(o_num);
		
		
		int cnt = sqlSessionTemplate.insert(namespace + ".insertOrderDetail",od);
		return cnt;
	}
	

}
