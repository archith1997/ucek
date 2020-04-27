

package interfaces;

import java.util.List;

import server.itemList;

public interface ICommand {

	// Command interface method to execute the commands
	public List<itemList> execute(String info);

} // interface ICommand
