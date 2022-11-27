select WarehouseID, SKU, QuantityOnOrder
from INVENTORY
where QuantityOnHand = 250
and WarehouseID = 400;