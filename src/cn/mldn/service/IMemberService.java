package cn.mldn.service;

public interface IMemberService {
	/**
	 * 检测现在要追加的用户ID信息是否重复
	 * @param id
	 * @return 如果重复了返回false，表示不可用，如果不重复返回true，表示可用
	 * @throws Exception
	 */
	public boolean checkMid(String id) throws Exception ;
}
