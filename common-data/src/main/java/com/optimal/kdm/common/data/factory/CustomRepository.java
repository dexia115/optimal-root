package com.optimal.kdm.common.data.factory;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import com.optimal.kdm.common.utils.Groups;
import com.optimal.kdm.common.utils.PageObj;

/**
 * 自定义仓库查询接口
 * @author liuxiaodong
 *
 * @param <T>
 * @param <ID>
 */
@NoRepositoryBean
public interface CustomRepository<T, ID extends Serializable> extends JpaRepository<T, ID>{
	
	PageObj<T> findEntityPageByGroups(Groups groups, PageObj<T> page);
	
	List<T> findEntityByGroups(Groups groups);
	
	long findTotalCountByGroups(Groups groups);
	
	T find(Long id);

}
