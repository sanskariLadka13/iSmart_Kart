<?php
class database{
  private $servername = "localhost";
  private $username = "root";
  private $password = "Himanshu@11";
  private $dbname = "smartdatabase";
  public $conn;

  public function get_connection(){
    try{
      $this->conn = new mysqli($this->servername, $this->username, $this->password,$this->dbname);
      return $this->conn;
    }
    catch(Exception $e){
      echo "Connection Error:".$e;
    }
}
}

?>
