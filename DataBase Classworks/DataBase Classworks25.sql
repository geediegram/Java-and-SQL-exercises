select WarehouseID, SKU, QuantityOnOrder
from INVENTORY
where QuantityOnHand = 250
or WarehouseID = 400;