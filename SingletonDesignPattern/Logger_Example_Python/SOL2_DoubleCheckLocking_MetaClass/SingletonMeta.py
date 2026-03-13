from typing import Any, Dict
import threading

class SingletonMeta(type):

  _instance: Dict[Any, Any] ={}
  _lock = threading.Lock()

  def __call__(cls, *args: Any, **kwargs: Any) -> Any:
    if cls not in cls._instance:
      with cls._lock:
        if cls not in cls._instance:
          cls._instance[cls] = super().__call__(*args, **kwargs)
    return cls._instance[cls]
