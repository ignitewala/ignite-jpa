package com.datagrid.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteException;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.CacheAtomicityMode;
import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.cache.CacheWriteSynchronizationMode;
import org.apache.ignite.cache.store.jdbc.CacheJdbcPojoStoreFactory;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi;
import org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.datagrid.entity.Player;

@Configuration
@SuppressWarnings("rawtypes")
public class SpringConfiguration {

	/*@Bean
	IgniteConfiguration igniteConf(TcpDiscoverySpi discoverySpi, CacheConfiguration atomicQueryCache,
			CacheConfiguration atomicUpdateTimeStampCache) {
		IgniteConfiguration configuration = new IgniteConfiguration();
		configuration.setPeerClassLoadingEnabled(true);
		configuration.setDiscoverySpi(discoverySpi);
		configuration.setIgniteInstanceName("MyGrid");

		atomicQueryCache.setName("org.hibernate.cache.internal.StandardQueryCache");
		atomicUpdateTimeStampCache.setName("org.hibernate.cache.spi.UpdateTimestampsCache");
		//configuration.setCacheConfiguration(atomicQueryCache, atomicUpdateTimeStampCache);
		return configuration;
	}

	@Bean
	CacheConfiguration atomicCacheConfig() {
		CacheConfiguration queryCache = new CacheConfiguration<>();
		queryCache.setCacheMode(CacheMode.PARTITIONED);
		queryCache.setAtomicityMode(CacheAtomicityMode.ATOMIC);
		queryCache.setWriteSynchronizationMode(CacheWriteSynchronizationMode.FULL_SYNC);
		return queryCache;
	}

	@Bean
	TcpDiscoverySpi discoverySpi() {
		TcpDiscoverySpi spi = new TcpDiscoverySpi();
		TcpDiscoveryMulticastIpFinder finder = new TcpDiscoveryMulticastIpFinder();
		finder.setAddresses(Arrays.asList(new String[] { "127.0.0.1:47500..47509" }));
		spi.setIpFinder(finder);
		return spi;
	}

	@Bean(destroyMethod = "close")
	Ignite ignite(IgniteConfiguration igniteConf) throws IgniteException {
		final Ignite start = Ignition.start(igniteConf);
		return start;
	}

	@Bean
	public Ignite igniteInstance() {
	   IgniteConfiguration cfg = new IgniteConfiguration();
	   cfg.setIgniteInstanceName("ignite-1");
	   cfg.setPeerClassLoadingEnabled(true);
	 
	   CacheConfiguration<Long, Player> ccfg2 = new CacheConfiguration<>("PlayerCache"); // (1)
	   ccfg2.setIndexedTypes(Long.class, Player.class); // (2)
	   ccfg2.setWriteBehindEnabled(true);
	   ccfg2.setWriteThrough(true); // (3)
	   ccfg2.setReadThrough(true); // (4)
	   CacheJdbcPojoStoreFactory<Long, Player> f2 = new CacheJdbcPojoStoreFactory<>(); // (5)
	   f2.setDataSource(datasource); // (6)
	   f2.setDialect(new MySQLDialect()); // (7)
	   JdbcType jdbcContactType = new JdbcType(); // (8)
	   jdbcContactType.setCacheName("ContactCache");
	   jdbcContactType.setKeyType(Long.class);
	   jdbcContactType.setValueType(Contact.class);
	   jdbcContactType.setDatabaseTable("contact");
	   jdbcContactType.setDatabaseSchema("ignite");
	   jdbcContactType.setKeyFields(new JdbcTypeField(Types.INTEGER, "id", Long.class, "id"));
	   jdbcContactType.setValueFields(new JdbcTypeField(Types.VARCHAR, "contact_type", ContactType.class, "type"), new JdbcTypeField(Types.VARCHAR, "location", String.class, "location"), new JdbcTypeField(Types.INTEGER, "person_id", Long.class, "personId"));
	   f2.setTypes(jdbcContactType);
	   ccfg2.setCacheStoreFactory(f2);
	 
	   CacheConfiguration<Long, Person> ccfg = new CacheConfiguration<>("PersonCache");
	   ccfg.setIndexedTypes(Long.class, Person.class);
	   ccfg.setWriteBehindEnabled(true);
	   ccfg.setReadThrough(true);
	   ccfg.setWriteThrough(true);
	   CacheJdbcPojoStoreFactory<Long, Person> f = new CacheJdbcPojoStoreFactory<>();
	   f.setDataSource(datasource);
	   f.setDialect(new MySQLDialect());
	   JdbcType jdbcType = new JdbcType();
	   jdbcType.setCacheName("PersonCache");
	   jdbcType.setKeyType(Long.class);
	   jdbcType.setValueType(Person.class);
	   jdbcType.setDatabaseTable("person");
	   jdbcType.setDatabaseSchema("ignite");
	   jdbcType.setKeyFields(new JdbcTypeField(Types.INTEGER, "id", Long.class, "id"));
	   jdbcType.setValueFields(new JdbcTypeField(Types.VARCHAR, "first_name", String.class, "firstName"), new JdbcTypeField(Types.VARCHAR, "last_name", String.class, "lastName"), new JdbcTypeField(Types.VARCHAR, "gender", Gender.class, "gender"), new JdbcTypeField(Types.VARCHAR, "country", String.class, "country"), new JdbcTypeField(Types.VARCHAR, "city", String.class, "city"), new JdbcTypeField(Types.VARCHAR, "address", String.class, "address"), new JdbcTypeField(Types.DATE, "birth_date", Date.class, "birthDate"));
	   f.setTypes(jdbcType);
	   ccfg.setCacheStoreFactory(f);
	 
	   cfg.setCacheConfiguration(ccfg, ccfg2);
	   return Ignition.start(cfg);
	}*/
}
