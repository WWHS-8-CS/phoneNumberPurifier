#!/bin/bash
echo "Name: "; read name
echo "Phone Number: "; read number
echo Name: `cat <(echo $name | tr -s [:space:] '\n' | grep -oP -m 2 '[a-zA-Z]+(?![^\s])' )`
echo Phone Number: `cat <(echo $number | tr -cd [:digit:] | cut -c -10 | sed -e 's/\([0-9]..\)\([0-9]..\)\([0-9]...\)/(\1)-\2-\3/' -e 's/\([0-9]\{3\}\)\([0-9]\{4\}\)/\1-\2/')`