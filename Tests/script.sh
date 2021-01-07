#!/bin/bash

directory=${1}
action=${2}
argument=${3}

if [ "$action" == 'ana' ]; then
  (
    echo "Number of files that contain $argument is:"
    find $directory -name *$argument* -printf '.' | wc -m
  )
elif [ "$action" == 'del' ]; then
  (
    find $directory -type f -size +$argument -exec rm -i {} \;
    echo "Delete request(s) to all files larger then $argument bytes was/were prompted to user."
  )
elif [ "$action" == 'arr' ]; then
  (
    find $directory -type f -name *.$argument -exec mv -i {} $directory/$argument \;
    echo "File(s) with extension $argument moved to newly created directory $directory/$argument "
  )
else
  echo 'error! incorrect action, script will exit!'
  exit 1
fi
