#!/usr/bin/env bash
echo "start hadoop cluster."

"${HADOOP_HOME}"/sbin/start-dfs.sh

"${HADOOP_HOME}"/sbin/start-yarn.sh

"${HADOOP_HOME}"/sbin/mr-jobhistory-daemon.sh start historyserver
