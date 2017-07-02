package cn.e3mall.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * DataGridResult=表现层需要的结果;
 * 由服务层传给表现层,需要网络传输,所以需要实现Serializable序列化接口;
 * @author Administrator
 *
 */
public class DataGridResult implements Serializable{

	private long total;

	private List<?> rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
