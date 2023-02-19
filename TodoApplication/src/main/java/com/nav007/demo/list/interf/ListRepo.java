package com.nav007.demo.list.interf;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nav007.demo.list.TodoList;

public interface ListRepo extends JpaRepository<TodoList, Integer> {

	

	

}
/* </form> 
<form action ="delete">
<input type="hidden" name="del" value="<%=s.getId() %>" >

<input type="submit" value="remove">

</form>  */
//   <input type="text" name ="id">   