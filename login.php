<?php
include_once "G:\Smartcart_database\config.php";
$database = new database();
$conn = $database->get_connection();
$data = json_decode(file_get_contents('php://input'),true);
if(isset($data)){
  $username = $data["username"];
  $number = $data["number"];

  $query = "INSERT INTO customers(name,number) VALUES ('".$username."',".$number.")";
  if ($conn->query($query) === TRUE) {
  echo "New record created successfully";
} else {
  echo "Error: " . $query . "<br>" . $conn->error;
}
$conn->close();
}
?>
