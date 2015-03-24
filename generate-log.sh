#!/bin/bash
log_message()
{
	Current_Date=`date +'%b %d %H:%M:%S'`
	Host=`hostname`
	echo "$Current_Date $Host $0[$$]: $1" >> $2
# Generate a log events
for (( i = 1; i <= $1 ; i++ ))
do
	log_message "INFO: Login successful for user Alice" $2
	log_message "INFO: Login successful for user Bob" $2
	log_message "WARNING: Login failed for user Mallory" $2
	log_message "SEVERE: Received SEGFAULT signal from process Eve" $2
	log_message "INFO: Logout occurred for user Alice" $2
	log_message "INFO: User Walter accessed file /var/log/messages" $2
	log_message "INFO: Login successful for user Chuck" $2
	log_message "INFO: Password updated for user Craig" $2
	log_message "SEVERE: Disk write failure" $2
	log_message "SEVERE: Unable to complete transaction - Out of memory" $2
done
