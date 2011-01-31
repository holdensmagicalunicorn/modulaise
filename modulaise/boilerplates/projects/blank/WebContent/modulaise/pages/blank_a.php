<?php 

// Include controller
require_once ($_SERVER["DOCUMENT_ROOT"].DIRECTORY_SEPARATOR."..".DIRECTORY_SEPARATOR."modulaise".DIRECTORY_SEPARATOR."scripts".DIRECTORY_SEPARATOR."php".DIRECTORY_SEPARATOR."modulaise-controller.php");

// Create a page using one of the template files from the templates folder
ModulaiseController::createPage("wide.php",basename(__FILE__,".php"));

// define page contents
ModulaiseController::addModule("head","bla_blank");
ModulaiseController::addModule("head","bla_blank","alternative.html");

// print the page
ModulaiseController::printPage();

?>