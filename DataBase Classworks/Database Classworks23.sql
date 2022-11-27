select WarehouseID, SKU, QuantityOnOrder
from INVENTORY
where QuantityOnHand = 100
and WarehouseID = 300;