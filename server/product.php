<?php
include_once "G:\Smartcart_database\config.php";
$database = new database();
$conn = $database->get_connection();
$data = json_decode(file_get_contents('php://input'),true);
if(isset($data)){
  $id = $data['barcode'];
  $query = "SELECT * FROM products WHERE id=".$id;
  $result = $conn->query($query) -> fetch_assoc();
  $return_json = array('name'=>$result['name'],"weight"=>$result['weight'],
  "price"=>$result['price'],"quantity"=>$result['quantity']);
  echo json_encode($return_json);
}
?>
