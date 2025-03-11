package lk.ijse.final_project.service.impl;

import com.example.demo.dto.CustomDTO;
import com.example.demo.dto.InventoryDTO;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface InventoryService {

    InventoryDTO saveInventory(InventoryDTO inventoryDTO  );
    InventoryDTO updateInventory(InventoryDTO inventoryDTO);
    boolean deleteInventory(String id);
    List<InventoryDTO> getAllInventory();
    List<InventoryDTO> searchInventory(String name);

    @ResponseBody
    CustomDTO inventoryIdGenerate();
}
