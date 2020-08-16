package SpringInAction;

import redis.clients.jedis.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/7/1 18:19
 */
public class RedisTest {

	public static void main(String[] args) {
		testPool();
	}

	public static void testPool() {
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		//jedis.auth("123456");

		//jedis.set("no1", "111");
		System.out.println(jedis.get("no1"));
	}

}
