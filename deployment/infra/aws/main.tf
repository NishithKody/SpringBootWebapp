terraform {
  required_providers {
	aws = {
	  source  = "hashicorp/aws"
	  version = "~> 4.16"
	}
  }

  required_version = ">= 1.2.0"
}

provider "aws" {
  region  = "us-west-2"
  profile = "dev"
}

resource "aws_vpc" "main" {
 cidr_block = "10.0.0.0/16"
 tags = {
	Name = "Project VPC"
 }
}