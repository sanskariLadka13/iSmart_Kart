<?php
include_once "G:\Smartcart_database\config.php";
$database = new database();
$conn = $database->get_connection();
$data = json_decode(file_get_contents('php://input'),true);
if(isset($data)){
  $username = $data['username'];
  $number = $data['number'];
  $query = "SELECT id FROM customers WHERE name='".$username."'AND number=".$number;
  $result = $conn->query($query);
  if(mysqli_num_rows($result)>0){
    $row = $result -> fetch_assoc();
    $return_json=array("customer_id"=>$row['id']);
    echo json_encode($return_json);
  }
}
?>
