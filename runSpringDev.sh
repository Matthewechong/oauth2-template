#!/bin/bash
KEYCLOAK_PATH=/Users/chongster/Desktop/Code/Keycloak/keycloak-19.0.3
JKS_STORE=/Users/chongster/Desktop/Code/Cert/oauth2-keycloak.jks

cd $KEYCLOAK_PATH
bin/kc.sh start --https-key-store-file=$JKS_STORE
